package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_176 {
    private final Production91_176 production = new Production91_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}