package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_488 {
    private final Production26_488 production = new Production26_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}