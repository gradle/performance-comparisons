package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_89 {
    private final Production94_89 production = new Production94_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}