package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_11 {
    private final Production71_11 production = new Production71_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}