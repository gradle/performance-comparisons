package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_155 {
    private final Production72_155 production = new Production72_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}