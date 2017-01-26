package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_67 {
    private final Production94_67 production = new Production94_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}