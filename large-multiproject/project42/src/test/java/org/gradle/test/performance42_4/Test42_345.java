package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_345 {
    private final Production42_345 production = new Production42_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}