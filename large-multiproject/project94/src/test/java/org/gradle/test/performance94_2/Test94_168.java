package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_168 {
    private final Production94_168 production = new Production94_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}