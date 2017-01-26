package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_479 {
    private final Production26_479 production = new Production26_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}