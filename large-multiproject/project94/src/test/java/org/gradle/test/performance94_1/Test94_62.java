package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_62 {
    private final Production94_62 production = new Production94_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}