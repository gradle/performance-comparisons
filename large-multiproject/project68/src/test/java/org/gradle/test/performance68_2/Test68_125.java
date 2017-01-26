package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_125 {
    private final Production68_125 production = new Production68_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}