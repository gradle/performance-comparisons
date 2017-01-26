package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_5 {
    private final Production68_5 production = new Production68_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}