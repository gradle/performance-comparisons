package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_342 {
    private final Production91_342 production = new Production91_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}