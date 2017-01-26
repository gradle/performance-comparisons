package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_12 {
    private final Production91_12 production = new Production91_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}