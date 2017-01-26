package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_333 {
    private final Production42_333 production = new Production42_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}