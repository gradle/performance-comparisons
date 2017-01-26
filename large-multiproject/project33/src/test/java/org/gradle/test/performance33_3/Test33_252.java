package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_252 {
    private final Production33_252 production = new Production33_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}