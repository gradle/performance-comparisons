package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_370 {
    private final Production79_370 production = new Production79_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}