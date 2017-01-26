package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_79 {
    private final Production68_79 production = new Production68_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}