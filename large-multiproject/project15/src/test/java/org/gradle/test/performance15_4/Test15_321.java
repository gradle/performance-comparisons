package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_321 {
    private final Production15_321 production = new Production15_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}