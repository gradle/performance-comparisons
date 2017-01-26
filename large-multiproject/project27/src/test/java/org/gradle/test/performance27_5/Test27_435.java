package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_435 {
    private final Production27_435 production = new Production27_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}