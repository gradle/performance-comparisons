package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_84 {
    private final Production33_84 production = new Production33_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}