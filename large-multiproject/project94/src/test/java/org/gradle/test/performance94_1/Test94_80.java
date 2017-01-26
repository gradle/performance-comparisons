package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_80 {
    private final Production94_80 production = new Production94_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}