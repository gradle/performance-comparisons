package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_242 {
    private final Production30_242 production = new Production30_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}