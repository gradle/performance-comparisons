package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_381 {
    private final Production26_381 production = new Production26_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}