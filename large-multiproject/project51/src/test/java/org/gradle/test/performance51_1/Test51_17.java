package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_17 {
    private final Production51_17 production = new Production51_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}