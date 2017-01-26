package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_122 {
    private final Production68_122 production = new Production68_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}