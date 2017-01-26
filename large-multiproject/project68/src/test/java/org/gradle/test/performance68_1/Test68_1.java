package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_1 {
    private final Production68_1 production = new Production68_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}