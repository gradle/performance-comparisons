package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_178 {
    private final Production11_178 production = new Production11_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}