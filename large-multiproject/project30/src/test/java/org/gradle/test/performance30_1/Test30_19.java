package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_19 {
    private final Production30_19 production = new Production30_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}