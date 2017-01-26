package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_79 {
    private final Production33_79 production = new Production33_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}