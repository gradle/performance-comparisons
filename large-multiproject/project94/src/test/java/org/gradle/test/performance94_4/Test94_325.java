package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_325 {
    private final Production94_325 production = new Production94_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}