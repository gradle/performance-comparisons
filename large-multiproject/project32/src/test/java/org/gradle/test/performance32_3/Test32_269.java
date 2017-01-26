package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_269 {
    private final Production32_269 production = new Production32_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}