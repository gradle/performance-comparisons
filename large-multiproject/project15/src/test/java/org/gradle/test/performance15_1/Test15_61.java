package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_61 {
    private final Production15_61 production = new Production15_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}