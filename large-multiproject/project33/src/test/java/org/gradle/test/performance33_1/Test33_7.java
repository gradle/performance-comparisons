package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_7 {
    private final Production33_7 production = new Production33_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}