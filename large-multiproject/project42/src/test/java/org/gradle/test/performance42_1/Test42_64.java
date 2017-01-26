package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_64 {
    private final Production42_64 production = new Production42_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}