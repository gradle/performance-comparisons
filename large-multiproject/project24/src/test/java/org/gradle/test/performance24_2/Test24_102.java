package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_102 {
    private final Production24_102 production = new Production24_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}