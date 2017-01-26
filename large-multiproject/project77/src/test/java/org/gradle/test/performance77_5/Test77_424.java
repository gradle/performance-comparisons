package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_424 {
    private final Production77_424 production = new Production77_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}