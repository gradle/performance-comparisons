package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_112 {
    private final Production94_112 production = new Production94_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}