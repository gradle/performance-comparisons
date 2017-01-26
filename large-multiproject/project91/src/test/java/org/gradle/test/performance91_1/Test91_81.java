package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_81 {
    private final Production91_81 production = new Production91_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}