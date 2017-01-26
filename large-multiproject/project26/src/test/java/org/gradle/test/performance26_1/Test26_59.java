package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_59 {
    private final Production26_59 production = new Production26_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}