package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_54 {
    private final Production68_54 production = new Production68_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}