package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_178 {
    private final Production44_178 production = new Production44_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}