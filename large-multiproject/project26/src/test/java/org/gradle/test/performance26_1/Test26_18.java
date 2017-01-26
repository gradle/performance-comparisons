package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_18 {
    private final Production26_18 production = new Production26_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}