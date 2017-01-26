package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_17 {
    private final Production19_17 production = new Production19_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}