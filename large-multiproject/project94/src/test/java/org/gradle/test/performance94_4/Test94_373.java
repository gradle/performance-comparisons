package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_373 {
    private final Production94_373 production = new Production94_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}