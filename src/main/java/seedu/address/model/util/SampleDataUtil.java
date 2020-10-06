package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.KanBugTracker;
import seedu.address.model.ReadOnlyKanBugTracker;
import seedu.address.model.bug.Bug;
import seedu.address.model.bug.Description;
import seedu.address.model.bug.Name;
import seedu.address.model.bug.State;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Bug[] getSamplePersons() {
        return new Bug[] {
            new Bug(new Name("Alex Yeoh"), new State("done"),
                new Description("Blk 30 Geylang Street 29, #06-40"),
                getTagSet("friends")),
            new Bug(new Name("Bernice Yu"), new State("done"),
                new Description("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                getTagSet("colleagues", "friends")),
            new Bug(new Name("Charlotte Oliveiro"), new State("done"),
                new Description("Blk 11 Ang Mo Kio Street 74, #11-04"),
                getTagSet("neighbours")),
            new Bug(new Name("David Li"), new State("done"),
                new Description("Blk 436 Serangoon Gardens Street 26, #16-43"),
                getTagSet("family")),
            new Bug(new Name("Irfan Ibrahim"), new State("done"),
                new Description("Blk 47 Tampines Street 20, #17-35"),
                getTagSet("classmates")),
            new Bug(new Name("Roy Balakrishnan"), new State("done"),
                new Description("Blk 45 Aljunied Street 85, #11-31"),
                getTagSet("colleagues"))
        };
    }

    public static ReadOnlyKanBugTracker getSampleAddressBook() {
        KanBugTracker sampleAb = new KanBugTracker();
        for (Bug sampleBug : getSamplePersons()) {
            sampleAb.addBug(sampleBug);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
