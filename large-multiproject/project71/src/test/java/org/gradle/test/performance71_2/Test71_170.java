package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_170 {
    private final Production71_170 production = new Production71_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}