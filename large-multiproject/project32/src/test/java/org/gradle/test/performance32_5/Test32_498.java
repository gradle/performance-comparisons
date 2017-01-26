package org.gradle.test.performance32_5;

import static org.junit.Assert.*;

public class Test32_498 {
    private final Production32_498 production = new Production32_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}