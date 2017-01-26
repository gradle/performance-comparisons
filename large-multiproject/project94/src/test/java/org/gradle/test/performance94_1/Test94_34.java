package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_34 {
    private final Production94_34 production = new Production94_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}