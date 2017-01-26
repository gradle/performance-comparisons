package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_401 {
    private final Production68_401 production = new Production68_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}