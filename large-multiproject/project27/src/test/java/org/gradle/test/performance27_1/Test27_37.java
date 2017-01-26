package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_37 {
    private final Production27_37 production = new Production27_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}