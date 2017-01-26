package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_48 {
    private final Production27_48 production = new Production27_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}