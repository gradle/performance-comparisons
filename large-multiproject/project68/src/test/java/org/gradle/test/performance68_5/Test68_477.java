package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_477 {
    private final Production68_477 production = new Production68_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}