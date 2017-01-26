package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_238 {
    private final Production15_238 production = new Production15_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}