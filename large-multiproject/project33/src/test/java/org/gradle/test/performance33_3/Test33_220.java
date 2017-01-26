package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_220 {
    private final Production33_220 production = new Production33_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}