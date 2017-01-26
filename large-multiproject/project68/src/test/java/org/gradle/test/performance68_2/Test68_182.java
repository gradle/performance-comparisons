package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_182 {
    private final Production68_182 production = new Production68_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}