package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_26 {
    private final Production94_26 production = new Production94_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}