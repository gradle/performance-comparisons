package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_190 {
    private final Production68_190 production = new Production68_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}