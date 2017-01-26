package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_17 {
    private final Production99_17 production = new Production99_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}