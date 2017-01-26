package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_390 {
    private final Production68_390 production = new Production68_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}