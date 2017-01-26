package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_178 {
    private final Production60_178 production = new Production60_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}