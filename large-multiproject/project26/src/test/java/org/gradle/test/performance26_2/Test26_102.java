package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_102 {
    private final Production26_102 production = new Production26_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}