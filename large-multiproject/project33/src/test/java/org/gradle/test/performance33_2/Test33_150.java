package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_150 {
    private final Production33_150 production = new Production33_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}