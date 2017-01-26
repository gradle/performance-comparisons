package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_17 {
    private final Production65_17 production = new Production65_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}