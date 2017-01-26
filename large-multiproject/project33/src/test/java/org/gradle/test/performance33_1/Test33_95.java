package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_95 {
    private final Production33_95 production = new Production33_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}