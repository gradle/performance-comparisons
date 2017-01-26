package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_324 {
    private final Production26_324 production = new Production26_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}