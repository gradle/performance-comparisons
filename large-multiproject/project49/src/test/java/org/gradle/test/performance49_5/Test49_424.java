package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_424 {
    private final Production49_424 production = new Production49_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}