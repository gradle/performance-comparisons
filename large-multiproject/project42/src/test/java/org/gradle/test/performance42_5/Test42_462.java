package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_462 {
    private final Production42_462 production = new Production42_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}