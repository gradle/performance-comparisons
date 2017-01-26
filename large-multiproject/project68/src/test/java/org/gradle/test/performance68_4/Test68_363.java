package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_363 {
    private final Production68_363 production = new Production68_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}