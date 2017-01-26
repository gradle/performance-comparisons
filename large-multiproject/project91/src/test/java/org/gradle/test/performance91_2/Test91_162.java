package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_162 {
    private final Production91_162 production = new Production91_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}