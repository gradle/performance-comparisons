package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_446 {
    private final Production42_446 production = new Production42_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}