package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_49 {
    private final Production68_49 production = new Production68_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}