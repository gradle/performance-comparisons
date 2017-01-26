package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_129 {
    private final Production68_129 production = new Production68_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}