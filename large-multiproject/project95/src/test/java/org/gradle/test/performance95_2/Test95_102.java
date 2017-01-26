package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_102 {
    private final Production95_102 production = new Production95_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}