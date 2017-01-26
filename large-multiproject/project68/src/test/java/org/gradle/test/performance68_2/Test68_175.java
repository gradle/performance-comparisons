package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_175 {
    private final Production68_175 production = new Production68_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}