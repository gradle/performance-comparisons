package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_178 {
    private final Production95_178 production = new Production95_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}