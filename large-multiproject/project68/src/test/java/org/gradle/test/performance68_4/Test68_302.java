package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_302 {
    private final Production68_302 production = new Production68_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}