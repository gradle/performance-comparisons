package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_268 {
    private final Production20_268 production = new Production20_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}