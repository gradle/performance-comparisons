package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_74 {
    private final Production94_74 production = new Production94_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}