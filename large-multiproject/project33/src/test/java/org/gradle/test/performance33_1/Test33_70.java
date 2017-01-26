package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_70 {
    private final Production33_70 production = new Production33_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}