package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_19 {
    private final Production26_19 production = new Production26_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}