package org.gradle.test.performance11_1;

import static org.junit.Assert.*;

public class Test11_17 {
    private final Production11_17 production = new Production11_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}