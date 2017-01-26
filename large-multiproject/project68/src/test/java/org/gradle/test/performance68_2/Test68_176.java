package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_176 {
    private final Production68_176 production = new Production68_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}