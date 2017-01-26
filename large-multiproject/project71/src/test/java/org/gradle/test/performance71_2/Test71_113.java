package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_113 {
    private final Production71_113 production = new Production71_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}