package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_305 {
    private final Production68_305 production = new Production68_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}