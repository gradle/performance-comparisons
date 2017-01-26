package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_160 {
    private final Production68_160 production = new Production68_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}