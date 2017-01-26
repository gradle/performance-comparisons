package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_399 {
    private final Production9_399 production = new Production9_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}