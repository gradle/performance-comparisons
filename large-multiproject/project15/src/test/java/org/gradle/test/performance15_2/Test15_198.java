package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_198 {
    private final Production15_198 production = new Production15_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}