package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_47 {
    private final Production26_47 production = new Production26_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}