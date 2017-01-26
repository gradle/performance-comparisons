package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_220 {
    private final Production68_220 production = new Production68_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}