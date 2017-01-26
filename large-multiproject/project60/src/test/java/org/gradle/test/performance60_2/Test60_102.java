package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_102 {
    private final Production60_102 production = new Production60_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}