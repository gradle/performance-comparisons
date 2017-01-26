package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_365 {
    private final Production27_365 production = new Production27_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}