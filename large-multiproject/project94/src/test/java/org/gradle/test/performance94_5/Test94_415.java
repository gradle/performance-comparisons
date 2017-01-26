package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_415 {
    private final Production94_415 production = new Production94_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}