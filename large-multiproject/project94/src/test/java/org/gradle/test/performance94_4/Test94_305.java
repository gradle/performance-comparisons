package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_305 {
    private final Production94_305 production = new Production94_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}