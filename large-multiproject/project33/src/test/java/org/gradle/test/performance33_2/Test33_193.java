package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_193 {
    private final Production33_193 production = new Production33_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}