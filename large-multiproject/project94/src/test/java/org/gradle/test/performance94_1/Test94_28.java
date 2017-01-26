package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_28 {
    private final Production94_28 production = new Production94_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}