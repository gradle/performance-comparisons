package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_94 {
    private final Production71_94 production = new Production71_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}