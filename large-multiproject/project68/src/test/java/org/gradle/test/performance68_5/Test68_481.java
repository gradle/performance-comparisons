package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_481 {
    private final Production68_481 production = new Production68_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}