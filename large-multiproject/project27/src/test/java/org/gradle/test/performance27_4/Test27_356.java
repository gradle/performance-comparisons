package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_356 {
    private final Production27_356 production = new Production27_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}