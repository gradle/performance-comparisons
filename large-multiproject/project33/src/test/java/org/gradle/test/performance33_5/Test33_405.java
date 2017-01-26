package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_405 {
    private final Production33_405 production = new Production33_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}