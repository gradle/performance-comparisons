package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_268 {
    private final Production15_268 production = new Production15_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}