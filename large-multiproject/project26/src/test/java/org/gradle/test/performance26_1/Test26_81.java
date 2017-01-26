package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_81 {
    private final Production26_81 production = new Production26_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}