package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_134 {
    private final Production15_134 production = new Production15_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}