package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_242 {
    private final Production26_242 production = new Production26_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}