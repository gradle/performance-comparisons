package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_419 {
    private final Production27_419 production = new Production27_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}