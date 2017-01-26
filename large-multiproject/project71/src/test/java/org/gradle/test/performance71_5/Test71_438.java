package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_438 {
    private final Production71_438 production = new Production71_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}