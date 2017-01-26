package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_6 {
    private final Production68_6 production = new Production68_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}