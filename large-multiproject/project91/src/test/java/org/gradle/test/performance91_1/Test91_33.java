package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_33 {
    private final Production91_33 production = new Production91_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}