package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_180 {
    private final Production68_180 production = new Production68_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}