package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_129 {
    private final Production71_129 production = new Production71_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}