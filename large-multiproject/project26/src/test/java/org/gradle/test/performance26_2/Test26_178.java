package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_178 {
    private final Production26_178 production = new Production26_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}