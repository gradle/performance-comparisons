package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_398 {
    private final Production26_398 production = new Production26_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}