package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_265 {
    private final Production42_265 production = new Production42_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}