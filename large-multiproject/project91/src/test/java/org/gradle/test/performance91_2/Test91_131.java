package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_131 {
    private final Production91_131 production = new Production91_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}