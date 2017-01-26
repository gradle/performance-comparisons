package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_70 {
    private final Production26_70 production = new Production26_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}