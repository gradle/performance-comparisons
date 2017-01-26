package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_422 {
    private final Production68_422 production = new Production68_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}