package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_290 {
    private final Production26_290 production = new Production26_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}