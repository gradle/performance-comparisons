package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_46 {
    private final Production33_46 production = new Production33_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}