package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_294 {
    private final Production68_294 production = new Production68_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}