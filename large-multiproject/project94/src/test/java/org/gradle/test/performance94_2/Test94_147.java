package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_147 {
    private final Production94_147 production = new Production94_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}