package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_102 {
    private final Production62_102 production = new Production62_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}