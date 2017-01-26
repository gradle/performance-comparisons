package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_178 {
    private final Production39_178 production = new Production39_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}