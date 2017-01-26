package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_293 {
    private final Production94_293 production = new Production94_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}