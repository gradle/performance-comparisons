package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_188 {
    private final Production68_188 production = new Production68_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}