package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_119 {
    private final Production94_119 production = new Production94_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}