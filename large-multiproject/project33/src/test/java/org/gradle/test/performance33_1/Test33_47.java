package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_47 {
    private final Production33_47 production = new Production33_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}