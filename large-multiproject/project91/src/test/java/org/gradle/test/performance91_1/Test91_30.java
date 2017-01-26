package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_30 {
    private final Production91_30 production = new Production91_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}