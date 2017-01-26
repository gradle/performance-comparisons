package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_247 {
    private final Production42_247 production = new Production42_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}