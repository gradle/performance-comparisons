package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_370 {
    private final Production42_370 production = new Production42_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}