package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_96 {
    private final Production94_96 production = new Production94_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}