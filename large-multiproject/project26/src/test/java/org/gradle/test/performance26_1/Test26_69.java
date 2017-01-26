package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_69 {
    private final Production26_69 production = new Production26_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}