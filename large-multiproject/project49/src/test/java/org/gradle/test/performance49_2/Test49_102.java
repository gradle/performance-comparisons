package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_102 {
    private final Production49_102 production = new Production49_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}