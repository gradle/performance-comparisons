package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_63 {
    private final Production91_63 production = new Production91_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}