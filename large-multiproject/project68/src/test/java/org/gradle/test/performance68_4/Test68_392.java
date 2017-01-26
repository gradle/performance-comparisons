package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_392 {
    private final Production68_392 production = new Production68_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}