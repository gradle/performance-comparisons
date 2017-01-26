package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_12 {
    private final Production26_12 production = new Production26_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}