package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_152 {
    private final Production91_152 production = new Production91_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}