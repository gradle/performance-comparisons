package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_446 {
    private final Production68_446 production = new Production68_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}