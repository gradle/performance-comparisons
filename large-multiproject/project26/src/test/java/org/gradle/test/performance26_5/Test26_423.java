package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_423 {
    private final Production26_423 production = new Production26_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}