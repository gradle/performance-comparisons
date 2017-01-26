package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_54 {
    private final Production91_54 production = new Production91_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}