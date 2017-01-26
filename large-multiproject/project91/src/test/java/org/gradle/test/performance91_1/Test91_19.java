package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_19 {
    private final Production91_19 production = new Production91_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}