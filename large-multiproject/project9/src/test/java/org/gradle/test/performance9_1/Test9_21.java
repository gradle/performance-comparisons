package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_21 {
    private final Production9_21 production = new Production9_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}