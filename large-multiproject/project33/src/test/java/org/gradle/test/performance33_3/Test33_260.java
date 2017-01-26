package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_260 {
    private final Production33_260 production = new Production33_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}