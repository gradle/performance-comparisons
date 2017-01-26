package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_152 {
    private final Production68_152 production = new Production68_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}