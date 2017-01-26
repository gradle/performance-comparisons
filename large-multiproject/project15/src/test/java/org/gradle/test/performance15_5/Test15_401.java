package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_401 {
    private final Production15_401 production = new Production15_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}