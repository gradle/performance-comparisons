package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_462 {
    private final Production7_462 production = new Production7_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}