package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_242 {
    private final Production33_242 production = new Production33_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}