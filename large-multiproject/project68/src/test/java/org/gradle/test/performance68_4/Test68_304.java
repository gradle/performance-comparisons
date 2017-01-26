package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_304 {
    private final Production68_304 production = new Production68_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}