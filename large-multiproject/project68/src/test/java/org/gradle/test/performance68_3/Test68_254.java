package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_254 {
    private final Production68_254 production = new Production68_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}