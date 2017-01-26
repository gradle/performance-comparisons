package org.gradle.test.performance87_2;

import static org.junit.Assert.*;

public class Test87_178 {
    private final Production87_178 production = new Production87_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}