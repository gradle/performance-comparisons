package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_17 {
    private final Production17_17 production = new Production17_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}