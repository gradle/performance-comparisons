package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_300 {
    private final Production68_300 production = new Production68_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}