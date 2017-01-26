package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_102 {
    private final Production91_102 production = new Production91_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}