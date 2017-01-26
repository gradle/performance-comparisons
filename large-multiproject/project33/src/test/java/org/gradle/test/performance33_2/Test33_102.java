package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_102 {
    private final Production33_102 production = new Production33_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}