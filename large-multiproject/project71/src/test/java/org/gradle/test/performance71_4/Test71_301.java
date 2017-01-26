package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_301 {
    private final Production71_301 production = new Production71_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}