package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_102 {
    private final Production90_102 production = new Production90_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}