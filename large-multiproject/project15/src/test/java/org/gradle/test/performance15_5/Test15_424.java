package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_424 {
    private final Production15_424 production = new Production15_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}