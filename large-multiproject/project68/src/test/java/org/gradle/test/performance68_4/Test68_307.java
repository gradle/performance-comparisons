package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_307 {
    private final Production68_307 production = new Production68_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}