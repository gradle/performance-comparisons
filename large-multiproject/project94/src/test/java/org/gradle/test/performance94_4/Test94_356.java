package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_356 {
    private final Production94_356 production = new Production94_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}