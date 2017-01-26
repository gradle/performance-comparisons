package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_420 {
    private final Production68_420 production = new Production68_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}