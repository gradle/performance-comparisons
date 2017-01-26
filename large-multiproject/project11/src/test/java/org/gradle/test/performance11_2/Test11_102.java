package org.gradle.test.performance11_2;

import static org.junit.Assert.*;

public class Test11_102 {
    private final Production11_102 production = new Production11_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}