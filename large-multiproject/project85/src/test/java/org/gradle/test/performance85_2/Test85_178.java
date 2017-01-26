package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_178 {
    private final Production85_178 production = new Production85_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}