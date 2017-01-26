package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_30 {
    private final Production68_30 production = new Production68_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}