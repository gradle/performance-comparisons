package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_247 {
    private final Production68_247 production = new Production68_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}