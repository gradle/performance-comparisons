package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_352 {
    private final Production71_352 production = new Production71_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}