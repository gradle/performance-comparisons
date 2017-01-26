package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_38 {
    private final Production94_38 production = new Production94_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}