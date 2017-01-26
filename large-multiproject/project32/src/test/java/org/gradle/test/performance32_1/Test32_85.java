package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_85 {
    private final Production32_85 production = new Production32_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}