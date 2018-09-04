import org.rocksdb.Options;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

public class Main {
    public static void main(String[] args) {
        try(Options options = new Options()) {
            options.setCreateIfMissing(true);

            try(RocksDB rocksDB = RocksDB.open(options, "/tmp/rocksdb-temp")) {
                rocksDB.put("key".getBytes(), "value".getBytes());
            } catch (RocksDBException e) {
                e.printStackTrace();
            }
        }
    }
}
