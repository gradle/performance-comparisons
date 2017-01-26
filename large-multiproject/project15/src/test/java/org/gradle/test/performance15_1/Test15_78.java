package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_78 {
    private final Production15_78 production = new Production15_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}