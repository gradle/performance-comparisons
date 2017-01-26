package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_323 {
    private final Production68_323 production = new Production68_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}