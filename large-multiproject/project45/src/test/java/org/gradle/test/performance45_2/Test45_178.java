package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_178 {
    private final Production45_178 production = new Production45_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}