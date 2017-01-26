package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_364 {
    private final Production94_364 production = new Production94_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}