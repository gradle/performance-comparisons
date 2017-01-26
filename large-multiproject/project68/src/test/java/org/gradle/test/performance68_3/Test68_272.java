package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_272 {
    private final Production68_272 production = new Production68_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}