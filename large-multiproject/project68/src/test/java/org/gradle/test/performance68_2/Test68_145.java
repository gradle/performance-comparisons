package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_145 {
    private final Production68_145 production = new Production68_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}