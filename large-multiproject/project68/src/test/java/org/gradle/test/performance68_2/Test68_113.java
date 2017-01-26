package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_113 {
    private final Production68_113 production = new Production68_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}