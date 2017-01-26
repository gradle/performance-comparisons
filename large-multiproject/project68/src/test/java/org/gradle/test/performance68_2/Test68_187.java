package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_187 {
    private final Production68_187 production = new Production68_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}