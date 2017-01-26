package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_2 {
    private final Production27_2 production = new Production27_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}