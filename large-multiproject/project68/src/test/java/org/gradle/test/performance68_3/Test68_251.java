package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_251 {
    private final Production68_251 production = new Production68_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}