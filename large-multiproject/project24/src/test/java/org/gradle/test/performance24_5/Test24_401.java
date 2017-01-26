package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_401 {
    private final Production24_401 production = new Production24_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}