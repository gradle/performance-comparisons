package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_334 {
    private final Production68_334 production = new Production68_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}