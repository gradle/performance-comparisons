package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_57 {
    private final Production68_57 production = new Production68_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}