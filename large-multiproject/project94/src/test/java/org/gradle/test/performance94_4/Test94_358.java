package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_358 {
    private final Production94_358 production = new Production94_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}