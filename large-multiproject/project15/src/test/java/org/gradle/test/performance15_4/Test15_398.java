package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_398 {
    private final Production15_398 production = new Production15_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}