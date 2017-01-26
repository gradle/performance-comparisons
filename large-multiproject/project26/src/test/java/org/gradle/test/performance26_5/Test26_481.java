package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_481 {
    private final Production26_481 production = new Production26_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}