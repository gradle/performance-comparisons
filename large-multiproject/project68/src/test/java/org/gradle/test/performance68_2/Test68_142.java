package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_142 {
    private final Production68_142 production = new Production68_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}