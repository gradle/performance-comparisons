package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_178 {
    private final Production68_178 production = new Production68_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}