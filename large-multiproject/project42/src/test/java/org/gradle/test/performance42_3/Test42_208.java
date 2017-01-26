package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_208 {
    private final Production42_208 production = new Production42_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}