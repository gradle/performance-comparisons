package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_171 {
    private final Production68_171 production = new Production68_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}