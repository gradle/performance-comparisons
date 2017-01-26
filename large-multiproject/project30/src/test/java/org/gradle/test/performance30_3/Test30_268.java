package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_268 {
    private final Production30_268 production = new Production30_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}