package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_310 {
    private final Production26_310 production = new Production26_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}