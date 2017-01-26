package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_424 {
    private final Production79_424 production = new Production79_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}