package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_196 {
    private final Production33_196 production = new Production33_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}