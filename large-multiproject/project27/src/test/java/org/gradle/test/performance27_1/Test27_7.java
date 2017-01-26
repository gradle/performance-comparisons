package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_7 {
    private final Production27_7 production = new Production27_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}