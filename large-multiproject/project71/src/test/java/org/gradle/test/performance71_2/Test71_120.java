package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_120 {
    private final Production71_120 production = new Production71_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}