package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_42 {
    private final Production94_42 production = new Production94_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}