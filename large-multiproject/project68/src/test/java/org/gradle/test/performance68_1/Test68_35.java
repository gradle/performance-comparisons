package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_35 {
    private final Production68_35 production = new Production68_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}