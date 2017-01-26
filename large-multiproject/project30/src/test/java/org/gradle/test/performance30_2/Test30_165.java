package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_165 {
    private final Production30_165 production = new Production30_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}