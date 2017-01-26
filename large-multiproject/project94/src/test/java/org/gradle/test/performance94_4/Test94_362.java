package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_362 {
    private final Production94_362 production = new Production94_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}