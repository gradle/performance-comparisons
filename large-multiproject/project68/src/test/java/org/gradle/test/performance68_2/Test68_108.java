package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_108 {
    private final Production68_108 production = new Production68_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}