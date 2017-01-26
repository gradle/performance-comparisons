package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_115 {
    private final Production26_115 production = new Production26_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}