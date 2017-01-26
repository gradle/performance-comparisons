package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_291 {
    private final Production68_291 production = new Production68_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}