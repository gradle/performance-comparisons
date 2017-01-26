package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_254 {
    private final Production42_254 production = new Production42_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}