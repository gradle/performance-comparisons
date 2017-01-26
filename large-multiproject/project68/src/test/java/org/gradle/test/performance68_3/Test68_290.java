package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_290 {
    private final Production68_290 production = new Production68_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}