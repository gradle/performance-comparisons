package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_158 {
    private final Production30_158 production = new Production30_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}