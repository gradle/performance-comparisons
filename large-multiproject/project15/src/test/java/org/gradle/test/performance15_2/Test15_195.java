package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_195 {
    private final Production15_195 production = new Production15_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}