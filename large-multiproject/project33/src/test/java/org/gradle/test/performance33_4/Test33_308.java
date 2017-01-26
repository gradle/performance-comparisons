package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_308 {
    private final Production33_308 production = new Production33_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}