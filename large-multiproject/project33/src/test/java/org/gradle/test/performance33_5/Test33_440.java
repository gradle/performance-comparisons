package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_440 {
    private final Production33_440 production = new Production33_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}