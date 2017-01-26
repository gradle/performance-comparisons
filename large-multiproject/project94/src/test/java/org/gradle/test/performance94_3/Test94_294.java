package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_294 {
    private final Production94_294 production = new Production94_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}