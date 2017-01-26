package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_87 {
    private final Production68_87 production = new Production68_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}