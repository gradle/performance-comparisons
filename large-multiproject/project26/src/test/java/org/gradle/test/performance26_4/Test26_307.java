package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_307 {
    private final Production26_307 production = new Production26_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}