package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_266 {
    private final Production15_266 production = new Production15_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}