package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_132 {
    private final Production71_132 production = new Production71_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}