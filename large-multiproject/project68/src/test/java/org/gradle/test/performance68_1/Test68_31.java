package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_31 {
    private final Production68_31 production = new Production68_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}