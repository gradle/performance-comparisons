package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_381 {
    private final Production30_381 production = new Production30_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}