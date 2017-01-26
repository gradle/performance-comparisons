package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_421 {
    private final Production33_421 production = new Production33_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}