package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_67 {
    private final Production15_67 production = new Production15_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}