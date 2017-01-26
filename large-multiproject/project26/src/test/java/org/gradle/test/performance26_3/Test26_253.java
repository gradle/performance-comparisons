package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_253 {
    private final Production26_253 production = new Production26_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}