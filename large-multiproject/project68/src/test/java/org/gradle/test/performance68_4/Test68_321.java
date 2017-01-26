package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_321 {
    private final Production68_321 production = new Production68_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}