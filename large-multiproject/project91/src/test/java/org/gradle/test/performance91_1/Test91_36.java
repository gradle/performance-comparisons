package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_36 {
    private final Production91_36 production = new Production91_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}