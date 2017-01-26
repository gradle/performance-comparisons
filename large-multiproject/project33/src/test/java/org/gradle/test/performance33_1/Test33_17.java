package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_17 {
    private final Production33_17 production = new Production33_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}