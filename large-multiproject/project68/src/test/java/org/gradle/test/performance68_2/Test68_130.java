package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_130 {
    private final Production68_130 production = new Production68_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}