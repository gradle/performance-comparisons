package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_395 {
    private final Production68_395 production = new Production68_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}