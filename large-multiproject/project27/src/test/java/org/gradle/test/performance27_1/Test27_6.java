package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_6 {
    private final Production27_6 production = new Production27_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}