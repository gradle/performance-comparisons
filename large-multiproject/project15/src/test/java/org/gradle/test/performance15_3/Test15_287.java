package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_287 {
    private final Production15_287 production = new Production15_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}