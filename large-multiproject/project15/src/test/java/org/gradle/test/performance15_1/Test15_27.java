package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_27 {
    private final Production15_27 production = new Production15_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}