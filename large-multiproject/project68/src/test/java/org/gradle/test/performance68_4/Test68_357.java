package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_357 {
    private final Production68_357 production = new Production68_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}