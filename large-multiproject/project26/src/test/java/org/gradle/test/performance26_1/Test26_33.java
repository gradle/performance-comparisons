package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_33 {
    private final Production26_33 production = new Production26_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}