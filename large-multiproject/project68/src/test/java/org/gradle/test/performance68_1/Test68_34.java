package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_34 {
    private final Production68_34 production = new Production68_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}