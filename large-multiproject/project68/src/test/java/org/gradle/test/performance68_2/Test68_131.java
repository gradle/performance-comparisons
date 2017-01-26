package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_131 {
    private final Production68_131 production = new Production68_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}