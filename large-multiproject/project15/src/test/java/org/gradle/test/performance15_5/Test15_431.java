package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_431 {
    private final Production15_431 production = new Production15_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}