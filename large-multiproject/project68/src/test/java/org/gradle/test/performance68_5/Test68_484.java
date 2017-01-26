package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_484 {
    private final Production68_484 production = new Production68_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}