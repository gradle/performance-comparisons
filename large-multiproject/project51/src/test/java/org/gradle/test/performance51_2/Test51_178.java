package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_178 {
    private final Production51_178 production = new Production51_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}