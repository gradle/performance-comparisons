package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_83 {
    private final Production68_83 production = new Production68_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}