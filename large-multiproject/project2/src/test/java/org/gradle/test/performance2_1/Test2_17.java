package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_17 {
    private final Production2_17 production = new Production2_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}