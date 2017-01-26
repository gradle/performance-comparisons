package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_204 {
    private final Production68_204 production = new Production68_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}