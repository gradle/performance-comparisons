package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_146 {
    private final Production68_146 production = new Production68_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}