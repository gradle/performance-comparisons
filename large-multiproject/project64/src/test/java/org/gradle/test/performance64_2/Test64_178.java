package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_178 {
    private final Production64_178 production = new Production64_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}