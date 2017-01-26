package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_143 {
    private final Production33_143 production = new Production33_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}