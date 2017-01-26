package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_341 {
    private final Production68_341 production = new Production68_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}