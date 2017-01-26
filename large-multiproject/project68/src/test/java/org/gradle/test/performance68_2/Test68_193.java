package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_193 {
    private final Production68_193 production = new Production68_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}