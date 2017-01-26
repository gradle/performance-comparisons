package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_178 {
    private final Production99_178 production = new Production99_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}