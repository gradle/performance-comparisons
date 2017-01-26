package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_113 {
    private final Production26_113 production = new Production26_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}