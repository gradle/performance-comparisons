package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_19 {
    private final Production68_19 production = new Production68_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}