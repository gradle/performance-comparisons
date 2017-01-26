package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_242 {
    private final Production68_242 production = new Production68_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}