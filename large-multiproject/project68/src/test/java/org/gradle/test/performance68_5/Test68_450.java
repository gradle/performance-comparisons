package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_450 {
    private final Production68_450 production = new Production68_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}