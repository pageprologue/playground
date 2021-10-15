package playground.repository;

public class SQLRepository {
    public static final String FIND_USER_BY_ID = "select * from user where id = ?";
    public static final String INSERT_USER = "insert into user(name) values (?)";

    public static final String FIND_DOCUMENT_BY_ID = "select * from document where id = ?";
    public static final String FINE_OUTBOX_DOCUMENTS = "select * from document_approval where approver_id = ?";
    public static final String INSERT_DOCUMENT = "insert into document(title, category, contents, drafter_id, approval_state) values (?, ?, ?, ?, ?)";
}
