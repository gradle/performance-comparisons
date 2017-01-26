package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_440 {
    private final Production68_440 production = new Production68_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}