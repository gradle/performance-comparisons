package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_367 {
    private final Production68_367 production = new Production68_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}