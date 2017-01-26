package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_37 {
    private final Production26_37 production = new Production26_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}