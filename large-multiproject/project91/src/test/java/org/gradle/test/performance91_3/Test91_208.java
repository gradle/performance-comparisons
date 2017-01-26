package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_208 {
    private final Production91_208 production = new Production91_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}