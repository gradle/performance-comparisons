package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_452 {
    private final Production68_452 production = new Production68_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}