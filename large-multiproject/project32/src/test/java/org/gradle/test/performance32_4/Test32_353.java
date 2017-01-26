package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_353 {
    private final Production32_353 production = new Production32_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}