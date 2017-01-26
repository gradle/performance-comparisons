package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_178 {
    private final Production17_178 production = new Production17_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}