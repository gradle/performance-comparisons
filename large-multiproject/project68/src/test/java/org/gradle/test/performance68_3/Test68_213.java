package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_213 {
    private final Production68_213 production = new Production68_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}