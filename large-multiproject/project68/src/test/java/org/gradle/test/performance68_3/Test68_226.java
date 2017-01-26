package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_226 {
    private final Production68_226 production = new Production68_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}