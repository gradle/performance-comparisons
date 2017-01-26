package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_342 {
    private final Production71_342 production = new Production71_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}