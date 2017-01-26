package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_471 {
    private final Production94_471 production = new Production94_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}