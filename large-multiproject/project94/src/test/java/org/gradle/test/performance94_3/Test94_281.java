package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_281 {
    private final Production94_281 production = new Production94_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}