package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_434 {
    private final Production68_434 production = new Production68_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}