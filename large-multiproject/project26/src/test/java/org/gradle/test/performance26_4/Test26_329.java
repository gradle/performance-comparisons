package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_329 {
    private final Production26_329 production = new Production26_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}