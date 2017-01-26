package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_167 {
    private final Production94_167 production = new Production94_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}