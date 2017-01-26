package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_291 {
    private final Production30_291 production = new Production30_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}