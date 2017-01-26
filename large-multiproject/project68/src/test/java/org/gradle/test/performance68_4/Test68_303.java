package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_303 {
    private final Production68_303 production = new Production68_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}