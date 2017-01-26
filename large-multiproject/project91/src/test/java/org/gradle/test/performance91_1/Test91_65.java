package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_65 {
    private final Production91_65 production = new Production91_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}