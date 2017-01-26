package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_174 {
    private final Production33_174 production = new Production33_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}