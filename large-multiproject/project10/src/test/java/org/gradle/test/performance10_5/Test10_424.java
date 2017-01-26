package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_424 {
    private final Production10_424 production = new Production10_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}