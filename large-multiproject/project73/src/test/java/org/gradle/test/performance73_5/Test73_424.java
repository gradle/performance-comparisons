package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_424 {
    private final Production73_424 production = new Production73_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}