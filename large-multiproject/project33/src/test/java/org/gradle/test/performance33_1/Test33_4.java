package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_4 {
    private final Production33_4 production = new Production33_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}