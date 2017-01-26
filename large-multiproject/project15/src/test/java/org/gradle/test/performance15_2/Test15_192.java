package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_192 {
    private final Production15_192 production = new Production15_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}