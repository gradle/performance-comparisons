package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_151 {
    private final Production68_151 production = new Production68_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}