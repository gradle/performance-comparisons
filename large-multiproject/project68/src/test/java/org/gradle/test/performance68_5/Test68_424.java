package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_424 {
    private final Production68_424 production = new Production68_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}