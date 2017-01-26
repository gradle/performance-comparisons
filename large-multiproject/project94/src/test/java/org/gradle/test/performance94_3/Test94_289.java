package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_289 {
    private final Production94_289 production = new Production94_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}