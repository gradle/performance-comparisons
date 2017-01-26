package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_21 {
    private final Production26_21 production = new Production26_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}