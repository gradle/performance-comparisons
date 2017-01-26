package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_356 {
    private final Production15_356 production = new Production15_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}