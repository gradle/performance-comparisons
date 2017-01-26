package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_437 {
    private final Production68_437 production = new Production68_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}