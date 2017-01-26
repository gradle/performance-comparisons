package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_317 {
    private final Production68_317 production = new Production68_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}