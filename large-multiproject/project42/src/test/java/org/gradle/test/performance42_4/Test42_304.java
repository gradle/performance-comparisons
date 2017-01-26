package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_304 {
    private final Production42_304 production = new Production42_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}