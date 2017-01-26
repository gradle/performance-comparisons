package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_217 {
    private final Production68_217 production = new Production68_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}