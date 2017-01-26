package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_16 {
    private final Production91_16 production = new Production91_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}