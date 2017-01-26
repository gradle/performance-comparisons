package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_17 {
    private final Production97_17 production = new Production97_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}