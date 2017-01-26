package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_244 {
    private final Production33_244 production = new Production33_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}