package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_436 {
    private final Production26_436 production = new Production26_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}