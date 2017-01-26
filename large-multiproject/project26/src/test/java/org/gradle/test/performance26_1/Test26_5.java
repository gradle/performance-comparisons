package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_5 {
    private final Production26_5 production = new Production26_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}