package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_342 {
    private final Production15_342 production = new Production15_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}