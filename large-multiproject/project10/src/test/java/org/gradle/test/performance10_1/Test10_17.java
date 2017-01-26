package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_17 {
    private final Production10_17 production = new Production10_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}