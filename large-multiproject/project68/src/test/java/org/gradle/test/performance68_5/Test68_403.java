package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_403 {
    private final Production68_403 production = new Production68_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}