package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_274 {
    private final Production68_274 production = new Production68_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}