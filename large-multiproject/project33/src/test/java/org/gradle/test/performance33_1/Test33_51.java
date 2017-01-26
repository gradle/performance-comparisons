package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_51 {
    private final Production33_51 production = new Production33_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}