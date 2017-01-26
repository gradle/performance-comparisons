package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_436 {
    private final Production33_436 production = new Production33_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}