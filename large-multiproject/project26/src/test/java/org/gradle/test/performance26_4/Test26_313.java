package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_313 {
    private final Production26_313 production = new Production26_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}