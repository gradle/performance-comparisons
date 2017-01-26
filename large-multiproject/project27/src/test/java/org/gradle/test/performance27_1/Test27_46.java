package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_46 {
    private final Production27_46 production = new Production27_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}