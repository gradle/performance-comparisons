package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_53 {
    private final Production94_53 production = new Production94_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}