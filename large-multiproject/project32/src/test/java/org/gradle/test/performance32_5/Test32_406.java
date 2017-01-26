package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_406 {
    private final Production32_406 production = new Production32_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}