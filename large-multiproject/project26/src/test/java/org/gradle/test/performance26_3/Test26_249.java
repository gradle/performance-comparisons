package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_249 {
    private final Production26_249 production = new Production26_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}