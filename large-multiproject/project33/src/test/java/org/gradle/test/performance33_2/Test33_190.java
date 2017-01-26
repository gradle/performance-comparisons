package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_190 {
    private final Production33_190 production = new Production33_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}