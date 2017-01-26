package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_297 {
    private final Production68_297 production = new Production68_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}