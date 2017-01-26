package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_12 {
    private final Production68_12 production = new Production68_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}