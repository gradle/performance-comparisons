package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_182 {
    private final Production33_182 production = new Production33_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}