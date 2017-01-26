package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_180 {
    private final Production71_180 production = new Production71_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}