package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_333 {
    private final Production30_333 production = new Production30_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}