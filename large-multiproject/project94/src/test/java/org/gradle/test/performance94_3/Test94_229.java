package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_229 {
    private final Production94_229 production = new Production94_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}