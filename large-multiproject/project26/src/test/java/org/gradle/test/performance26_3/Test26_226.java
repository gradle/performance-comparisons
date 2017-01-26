package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_226 {
    private final Production26_226 production = new Production26_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}