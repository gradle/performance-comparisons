package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_432 {
    private final Production94_432 production = new Production94_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}