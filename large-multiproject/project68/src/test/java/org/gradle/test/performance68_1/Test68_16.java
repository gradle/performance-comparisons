package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_16 {
    private final Production68_16 production = new Production68_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}