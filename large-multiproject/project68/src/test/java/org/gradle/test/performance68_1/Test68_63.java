package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_63 {
    private final Production68_63 production = new Production68_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}