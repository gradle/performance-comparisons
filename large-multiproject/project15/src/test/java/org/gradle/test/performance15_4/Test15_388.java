package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_388 {
    private final Production15_388 production = new Production15_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}