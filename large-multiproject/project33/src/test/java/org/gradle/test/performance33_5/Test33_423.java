package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_423 {
    private final Production33_423 production = new Production33_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}