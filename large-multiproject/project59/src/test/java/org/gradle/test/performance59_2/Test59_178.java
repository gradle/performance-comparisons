package org.gradle.test.performance59_2;

import static org.junit.Assert.*;

public class Test59_178 {
    private final Production59_178 production = new Production59_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}