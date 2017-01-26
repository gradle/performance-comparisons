package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_30 {
    private final Production26_30 production = new Production26_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}