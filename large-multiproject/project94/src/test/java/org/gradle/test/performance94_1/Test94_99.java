package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_99 {
    private final Production94_99 production = new Production94_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}