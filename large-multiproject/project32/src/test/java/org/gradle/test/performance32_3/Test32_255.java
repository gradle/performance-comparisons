package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_255 {
    private final Production32_255 production = new Production32_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}