package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_178 {
    private final Production36_178 production = new Production36_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}