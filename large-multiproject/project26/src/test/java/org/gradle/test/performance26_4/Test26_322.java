package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_322 {
    private final Production26_322 production = new Production26_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}