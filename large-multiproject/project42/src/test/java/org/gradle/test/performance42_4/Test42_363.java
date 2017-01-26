package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_363 {
    private final Production42_363 production = new Production42_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}