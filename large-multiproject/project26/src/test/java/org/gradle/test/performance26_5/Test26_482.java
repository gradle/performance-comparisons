package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_482 {
    private final Production26_482 production = new Production26_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}