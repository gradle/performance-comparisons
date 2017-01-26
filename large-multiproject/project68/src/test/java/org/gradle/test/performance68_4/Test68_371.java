package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_371 {
    private final Production68_371 production = new Production68_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}