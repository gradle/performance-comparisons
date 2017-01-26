package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_322 {
    private final Production33_322 production = new Production33_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}