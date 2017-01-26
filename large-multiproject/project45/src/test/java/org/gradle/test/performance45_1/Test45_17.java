package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_17 {
    private final Production45_17 production = new Production45_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}