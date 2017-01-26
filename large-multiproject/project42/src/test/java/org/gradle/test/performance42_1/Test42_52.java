package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_52 {
    private final Production42_52 production = new Production42_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}