package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_17 {
    private final Production73_17 production = new Production73_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}