package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_398 {
    private final Production42_398 production = new Production42_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}