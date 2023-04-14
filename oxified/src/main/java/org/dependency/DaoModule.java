package main.java.org.dependency;

import com.amazon.ata.aws.dynamodb.DynamoDbClientProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DaoModule {
    @Singleton
    @Provides
    public DynamoDBMapper provideDBMapper() {
        return new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient(Regions.US_WEST_2));
    }
}
