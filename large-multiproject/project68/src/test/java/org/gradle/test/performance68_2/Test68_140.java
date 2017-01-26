package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_140 {
    private final Production68_140 production = new Production68_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}