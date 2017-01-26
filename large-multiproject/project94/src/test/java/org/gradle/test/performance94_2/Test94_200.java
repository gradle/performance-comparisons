package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_200 {
    private final Production94_200 production = new Production94_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}