package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_212 {
    private final Production94_212 production = new Production94_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}