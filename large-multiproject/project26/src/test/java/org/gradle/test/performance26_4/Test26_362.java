package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_362 {
    private final Production26_362 production = new Production26_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}