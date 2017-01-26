package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_404 {
    private final Production72_404 production = new Production72_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}