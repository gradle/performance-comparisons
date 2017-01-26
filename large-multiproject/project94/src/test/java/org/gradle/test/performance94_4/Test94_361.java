package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_361 {
    private final Production94_361 production = new Production94_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}