package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_139 {
    private final Production68_139 production = new Production68_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}