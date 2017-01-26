package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_222 {
    private final Production68_222 production = new Production68_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}