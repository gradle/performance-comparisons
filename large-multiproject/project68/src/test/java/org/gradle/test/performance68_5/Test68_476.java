package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_476 {
    private final Production68_476 production = new Production68_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}