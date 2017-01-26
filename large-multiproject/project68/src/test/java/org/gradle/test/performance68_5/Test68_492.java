package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_492 {
    private final Production68_492 production = new Production68_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}