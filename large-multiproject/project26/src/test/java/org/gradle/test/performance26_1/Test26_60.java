package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_60 {
    private final Production26_60 production = new Production26_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}