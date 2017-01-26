package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_17 {
    private final Production85_17 production = new Production85_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}