package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_3 {
    private final Production94_3 production = new Production94_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}