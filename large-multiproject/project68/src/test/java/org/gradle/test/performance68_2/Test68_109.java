package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_109 {
    private final Production68_109 production = new Production68_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}