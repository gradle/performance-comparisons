package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_60 {
    private final Production27_60 production = new Production27_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}