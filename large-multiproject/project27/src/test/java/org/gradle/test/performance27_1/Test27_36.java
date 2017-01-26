package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_36 {
    private final Production27_36 production = new Production27_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}