package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_424 {
    private final Production97_424 production = new Production97_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}