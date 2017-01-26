package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_381 {
    private final Production7_381 production = new Production7_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}