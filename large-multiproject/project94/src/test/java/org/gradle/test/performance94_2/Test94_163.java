package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_163 {
    private final Production94_163 production = new Production94_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}