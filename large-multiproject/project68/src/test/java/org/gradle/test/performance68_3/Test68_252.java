package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_252 {
    private final Production68_252 production = new Production68_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}