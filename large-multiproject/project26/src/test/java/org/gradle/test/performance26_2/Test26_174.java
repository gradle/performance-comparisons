package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_174 {
    private final Production26_174 production = new Production26_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}