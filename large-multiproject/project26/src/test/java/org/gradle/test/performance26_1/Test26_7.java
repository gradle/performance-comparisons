package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_7 {
    private final Production26_7 production = new Production26_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}