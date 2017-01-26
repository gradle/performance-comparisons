package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_419 {
    private final Production68_419 production = new Production68_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}