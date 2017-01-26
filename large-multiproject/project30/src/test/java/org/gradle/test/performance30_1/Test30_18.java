package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_18 {
    private final Production30_18 production = new Production30_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}