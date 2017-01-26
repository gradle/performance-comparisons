package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_52 {
    private final Production68_52 production = new Production68_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}