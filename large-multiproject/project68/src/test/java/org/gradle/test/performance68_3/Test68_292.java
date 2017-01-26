package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_292 {
    private final Production68_292 production = new Production68_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}