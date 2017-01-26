package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_17 {
    private final Production29_17 production = new Production29_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}