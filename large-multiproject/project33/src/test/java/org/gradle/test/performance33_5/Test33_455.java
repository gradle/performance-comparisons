package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_455 {
    private final Production33_455 production = new Production33_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}