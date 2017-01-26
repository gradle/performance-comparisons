package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_178 {
    private final Production42_178 production = new Production42_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}