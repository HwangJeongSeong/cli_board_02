package com.ll;

import com.ll.article.ArticleController;
import com.ll.system.SystemController;

public class App {
    public void run() {
        // ✅ DB 연결 먼저
        Container.getDBConnection().connect();

        // 컨트롤러 생성
        ArticleController articleController = new ArticleController();
        SystemController systemController = new SystemController();

        // 메인 루프
        while (true) {
            System.out.print("명령) ");
            String command = Container.getSc().nextLine().trim();

            Request request = new Request(command);
            String actionCode = request.getActionCode();

            switch (actionCode) {
                case "종료" -> {
                    systemController.exit();
                    return;
                }
                case "등록" -> articleController.write();
                case "목록" -> articleController.list();
                case "삭제" -> articleController.delete(request);
                case "수정" -> articleController.modify(request);
                default -> System.out.println("알 수 없는 명령입니다.");
            }
        }
    }
}
