package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_356 {
    private final Production3_356 production = new Production3_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}