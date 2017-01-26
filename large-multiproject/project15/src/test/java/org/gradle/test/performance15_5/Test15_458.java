package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_458 {
    private final Production15_458 production = new Production15_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}