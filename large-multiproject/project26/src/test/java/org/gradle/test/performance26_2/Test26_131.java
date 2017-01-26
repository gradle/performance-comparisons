package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_131 {
    private final Production26_131 production = new Production26_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}