package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_17 {
    private final Production66_17 production = new Production66_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}