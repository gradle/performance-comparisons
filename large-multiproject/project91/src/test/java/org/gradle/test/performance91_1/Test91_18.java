package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_18 {
    private final Production91_18 production = new Production91_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}