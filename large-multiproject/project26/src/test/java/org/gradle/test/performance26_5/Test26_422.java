package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_422 {
    private final Production26_422 production = new Production26_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}