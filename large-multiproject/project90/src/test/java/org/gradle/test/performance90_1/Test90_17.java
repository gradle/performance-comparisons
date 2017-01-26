package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_17 {
    private final Production90_17 production = new Production90_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}