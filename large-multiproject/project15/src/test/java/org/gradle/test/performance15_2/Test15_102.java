package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_102 {
    private final Production15_102 production = new Production15_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}