package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_205 {
    private final Production68_205 production = new Production68_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}