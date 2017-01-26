package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_424 {
    private final Production26_424 production = new Production26_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}