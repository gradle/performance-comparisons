package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_94 {
    private final Production68_94 production = new Production68_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}