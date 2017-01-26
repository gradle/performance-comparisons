package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_239 {
    private final Production68_239 production = new Production68_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}