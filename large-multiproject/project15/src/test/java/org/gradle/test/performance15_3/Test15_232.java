package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_232 {
    private final Production15_232 production = new Production15_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}