package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_268 {
    private final Production16_268 production = new Production16_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}