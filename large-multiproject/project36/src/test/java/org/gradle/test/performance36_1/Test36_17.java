package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_17 {
    private final Production36_17 production = new Production36_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}