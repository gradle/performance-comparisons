package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_435 {
    private final Production94_435 production = new Production94_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}