package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_425 {
    private final Production32_425 production = new Production32_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}