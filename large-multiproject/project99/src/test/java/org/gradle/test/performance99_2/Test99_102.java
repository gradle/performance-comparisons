package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_102 {
    private final Production99_102 production = new Production99_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}