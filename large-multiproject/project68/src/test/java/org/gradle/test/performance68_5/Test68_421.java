package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_421 {
    private final Production68_421 production = new Production68_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}