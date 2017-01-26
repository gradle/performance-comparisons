package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_143 {
    private final Production68_143 production = new Production68_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}