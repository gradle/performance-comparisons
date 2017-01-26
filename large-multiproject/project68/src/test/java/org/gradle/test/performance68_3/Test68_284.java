package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_284 {
    private final Production68_284 production = new Production68_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}