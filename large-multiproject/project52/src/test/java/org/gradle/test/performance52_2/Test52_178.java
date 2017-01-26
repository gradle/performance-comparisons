package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_178 {
    private final Production52_178 production = new Production52_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}