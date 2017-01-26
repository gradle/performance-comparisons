package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_404 {
    private final Production3_404 production = new Production3_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}