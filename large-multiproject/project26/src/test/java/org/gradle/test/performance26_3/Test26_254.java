package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_254 {
    private final Production26_254 production = new Production26_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}