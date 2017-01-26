package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_418 {
    private final Production94_418 production = new Production94_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}