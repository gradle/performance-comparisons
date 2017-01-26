package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_15 {
    private final Production68_15 production = new Production68_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}