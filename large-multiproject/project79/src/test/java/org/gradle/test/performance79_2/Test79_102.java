package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_102 {
    private final Production79_102 production = new Production79_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}