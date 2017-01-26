package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_403 {
    private final Production42_403 production = new Production42_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}