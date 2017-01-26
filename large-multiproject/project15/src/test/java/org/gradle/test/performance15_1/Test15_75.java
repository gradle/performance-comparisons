package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_75 {
    private final Production15_75 production = new Production15_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}