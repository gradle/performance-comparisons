package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_177 {
    private final Production68_177 production = new Production68_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}