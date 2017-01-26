package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_498 {
    private final Production68_498 production = new Production68_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}