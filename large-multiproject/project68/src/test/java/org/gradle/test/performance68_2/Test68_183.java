package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_183 {
    private final Production68_183 production = new Production68_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}