package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_468 {
    private final Production68_468 production = new Production68_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}