package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_461 {
    private final Production68_461 production = new Production68_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}