package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_244 {
    private final Production30_244 production = new Production30_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}