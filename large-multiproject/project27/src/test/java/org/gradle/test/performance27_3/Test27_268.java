package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_268 {
    private final Production27_268 production = new Production27_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}