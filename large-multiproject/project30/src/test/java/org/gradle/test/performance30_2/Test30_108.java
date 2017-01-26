package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_108 {
    private final Production30_108 production = new Production30_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}