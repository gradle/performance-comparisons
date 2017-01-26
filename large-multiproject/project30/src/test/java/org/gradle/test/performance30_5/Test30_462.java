package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_462 {
    private final Production30_462 production = new Production30_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}