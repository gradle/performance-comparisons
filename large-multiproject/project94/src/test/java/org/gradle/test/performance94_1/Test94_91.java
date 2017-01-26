package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_91 {
    private final Production94_91 production = new Production94_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}