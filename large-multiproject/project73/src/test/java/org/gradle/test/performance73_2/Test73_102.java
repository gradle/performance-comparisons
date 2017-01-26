package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_102 {
    private final Production73_102 production = new Production73_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}