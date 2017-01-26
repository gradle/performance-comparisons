package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_161 {
    private final Production68_161 production = new Production68_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}