package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_133 {
    private final Production33_133 production = new Production33_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}