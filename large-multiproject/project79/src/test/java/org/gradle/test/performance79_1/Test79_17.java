package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_17 {
    private final Production79_17 production = new Production79_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}