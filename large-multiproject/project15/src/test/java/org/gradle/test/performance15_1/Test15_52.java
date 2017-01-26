package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_52 {
    private final Production15_52 production = new Production15_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}