package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_217 {
    private final Production15_217 production = new Production15_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}