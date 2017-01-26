package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_135 {
    private final Production27_135 production = new Production27_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}