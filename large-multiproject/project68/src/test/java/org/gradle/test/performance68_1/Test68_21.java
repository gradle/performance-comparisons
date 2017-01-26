package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_21 {
    private final Production68_21 production = new Production68_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}