package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_56 {
    private final Production68_56 production = new Production68_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}