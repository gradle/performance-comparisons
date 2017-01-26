package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_333 {
    private final Production26_333 production = new Production26_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}