package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_339 {
    private final Production26_339 production = new Production26_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}