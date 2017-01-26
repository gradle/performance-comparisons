package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_95 {
    private final Production42_95 production = new Production42_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}