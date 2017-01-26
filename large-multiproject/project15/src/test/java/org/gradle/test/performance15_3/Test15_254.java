package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_254 {
    private final Production15_254 production = new Production15_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}