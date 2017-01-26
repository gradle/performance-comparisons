package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_23 {
    private final Production71_23 production = new Production71_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}