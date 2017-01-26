package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_479 {
    private final Production68_479 production = new Production68_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}