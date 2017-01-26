package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_120 {
    private final Production68_120 production = new Production68_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}