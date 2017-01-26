package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_445 {
    private final Production32_445 production = new Production32_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}