package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_258 {
    private final Production68_258 production = new Production68_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}