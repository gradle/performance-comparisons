package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_375 {
    private final Production71_375 production = new Production71_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}