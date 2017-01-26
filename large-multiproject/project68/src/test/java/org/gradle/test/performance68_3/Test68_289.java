package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_289 {
    private final Production68_289 production = new Production68_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}