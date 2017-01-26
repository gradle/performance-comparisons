package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_265 {
    private final Production68_265 production = new Production68_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}