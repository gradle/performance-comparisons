package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_8 {
    private final Production15_8 production = new Production15_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}