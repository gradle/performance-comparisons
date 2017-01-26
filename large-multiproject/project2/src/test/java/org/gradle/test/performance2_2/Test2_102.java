package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_102 {
    private final Production2_102 production = new Production2_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}