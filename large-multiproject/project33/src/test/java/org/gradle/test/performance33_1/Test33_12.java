package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_12 {
    private final Production33_12 production = new Production33_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}