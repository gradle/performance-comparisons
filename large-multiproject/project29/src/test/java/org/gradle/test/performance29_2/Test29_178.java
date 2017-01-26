package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_178 {
    private final Production29_178 production = new Production29_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}