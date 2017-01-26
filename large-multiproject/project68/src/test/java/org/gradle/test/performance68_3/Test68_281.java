package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_281 {
    private final Production68_281 production = new Production68_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}