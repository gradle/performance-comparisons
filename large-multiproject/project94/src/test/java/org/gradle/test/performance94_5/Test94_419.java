package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_419 {
    private final Production94_419 production = new Production94_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}