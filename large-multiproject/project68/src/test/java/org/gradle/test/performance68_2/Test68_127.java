package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_127 {
    private final Production68_127 production = new Production68_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}