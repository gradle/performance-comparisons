package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_243 {
    private final Production68_243 production = new Production68_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}