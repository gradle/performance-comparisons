package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_462 {
    private final Production68_462 production = new Production68_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}