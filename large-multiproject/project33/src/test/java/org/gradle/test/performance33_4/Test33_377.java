package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_377 {
    private final Production33_377 production = new Production33_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}