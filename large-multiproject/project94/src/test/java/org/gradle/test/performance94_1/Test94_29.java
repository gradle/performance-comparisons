package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_29 {
    private final Production94_29 production = new Production94_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}