package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_268 {
    private final Production68_268 production = new Production68_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}