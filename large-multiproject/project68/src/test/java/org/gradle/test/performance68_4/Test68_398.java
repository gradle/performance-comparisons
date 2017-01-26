package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_398 {
    private final Production68_398 production = new Production68_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}