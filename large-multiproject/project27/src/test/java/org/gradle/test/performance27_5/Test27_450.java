package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_450 {
    private final Production27_450 production = new Production27_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}