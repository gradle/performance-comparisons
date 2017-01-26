package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_18 {
    private final Production33_18 production = new Production33_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}