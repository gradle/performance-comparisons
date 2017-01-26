package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_192 {
    private final Production42_192 production = new Production42_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}