package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_287 {
    private final Production68_287 production = new Production68_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}