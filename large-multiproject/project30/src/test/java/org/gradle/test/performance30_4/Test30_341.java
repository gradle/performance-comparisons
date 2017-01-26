package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_341 {
    private final Production30_341 production = new Production30_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}