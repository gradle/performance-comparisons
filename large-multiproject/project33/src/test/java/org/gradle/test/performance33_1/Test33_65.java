package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_65 {
    private final Production33_65 production = new Production33_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}