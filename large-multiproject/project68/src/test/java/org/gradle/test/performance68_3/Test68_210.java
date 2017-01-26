package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_210 {
    private final Production68_210 production = new Production68_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}