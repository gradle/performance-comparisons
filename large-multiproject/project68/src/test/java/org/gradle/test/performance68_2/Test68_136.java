package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_136 {
    private final Production68_136 production = new Production68_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}