package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_53 {
    private final Production68_53 production = new Production68_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}