package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_403 {
    private final Production15_403 production = new Production15_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}