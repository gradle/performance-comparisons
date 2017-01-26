package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_382 {
    private final Production94_382 production = new Production94_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}