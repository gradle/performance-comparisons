package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_99 {
    private final Production91_99 production = new Production91_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}