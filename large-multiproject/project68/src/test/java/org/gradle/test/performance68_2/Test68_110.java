package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_110 {
    private final Production68_110 production = new Production68_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}