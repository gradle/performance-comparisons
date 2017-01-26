package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_341 {
    private final Production42_341 production = new Production42_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}