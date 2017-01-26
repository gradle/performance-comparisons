package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_320 {
    private final Production26_320 production = new Production26_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}