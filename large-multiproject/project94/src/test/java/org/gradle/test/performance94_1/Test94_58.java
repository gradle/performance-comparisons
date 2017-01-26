package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_58 {
    private final Production94_58 production = new Production94_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}