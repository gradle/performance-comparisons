package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_61 {
    private final Production27_61 production = new Production27_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}