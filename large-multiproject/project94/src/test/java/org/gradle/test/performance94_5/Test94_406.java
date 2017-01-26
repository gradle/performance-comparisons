package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_406 {
    private final Production94_406 production = new Production94_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}