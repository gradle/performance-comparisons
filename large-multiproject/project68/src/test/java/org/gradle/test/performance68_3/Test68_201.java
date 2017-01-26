package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_201 {
    private final Production68_201 production = new Production68_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}