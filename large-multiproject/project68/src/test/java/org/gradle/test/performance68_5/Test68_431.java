package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_431 {
    private final Production68_431 production = new Production68_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}