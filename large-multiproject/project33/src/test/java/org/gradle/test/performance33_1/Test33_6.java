package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_6 {
    private final Production33_6 production = new Production33_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}