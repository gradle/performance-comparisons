package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_337 {
    private final Production68_337 production = new Production68_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}