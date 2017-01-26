package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_3 {
    private final Production15_3 production = new Production15_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}