package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_78 {
    private final Production94_78 production = new Production94_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}