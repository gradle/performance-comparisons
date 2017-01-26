package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_103 {
    private final Production68_103 production = new Production68_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}