package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_185 {
    private final Production71_185 production = new Production71_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}