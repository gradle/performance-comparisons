package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_333 {
    private final Production9_333 production = new Production9_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}