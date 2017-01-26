package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_160 {
    private final Production42_160 production = new Production42_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}