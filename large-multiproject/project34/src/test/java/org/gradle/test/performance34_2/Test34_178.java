package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_178 {
    private final Production34_178 production = new Production34_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}