package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_216 {
    private final Production26_216 production = new Production26_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}