package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_468 {
    private final Production26_468 production = new Production26_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}