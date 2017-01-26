package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_42 {
    private final Production15_42 production = new Production15_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}