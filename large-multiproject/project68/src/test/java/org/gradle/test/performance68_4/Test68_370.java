package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_370 {
    private final Production68_370 production = new Production68_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}