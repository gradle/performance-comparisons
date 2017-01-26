package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_70 {
    private final Production68_70 production = new Production68_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}