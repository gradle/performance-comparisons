package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_164 {
    private final Production68_164 production = new Production68_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}