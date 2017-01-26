package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_54 {
    private final Production33_54 production = new Production33_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}