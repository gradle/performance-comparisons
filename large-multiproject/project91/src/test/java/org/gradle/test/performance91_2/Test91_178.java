package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_178 {
    private final Production91_178 production = new Production91_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}