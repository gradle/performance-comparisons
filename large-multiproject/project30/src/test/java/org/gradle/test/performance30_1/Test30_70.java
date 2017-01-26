package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_70 {
    private final Production30_70 production = new Production30_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}