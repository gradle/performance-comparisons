package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_10 {
    private final Production94_10 production = new Production94_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}