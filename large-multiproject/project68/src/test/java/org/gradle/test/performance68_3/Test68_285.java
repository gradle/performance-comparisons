package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_285 {
    private final Production68_285 production = new Production68_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}