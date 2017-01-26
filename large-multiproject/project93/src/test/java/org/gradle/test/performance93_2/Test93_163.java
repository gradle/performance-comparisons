package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_163 {
    private final Production93_163 production = new Production93_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}