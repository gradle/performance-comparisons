package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_324 {
    private final Production91_324 production = new Production91_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}