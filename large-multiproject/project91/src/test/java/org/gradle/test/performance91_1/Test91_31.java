package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_31 {
    private final Production91_31 production = new Production91_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}