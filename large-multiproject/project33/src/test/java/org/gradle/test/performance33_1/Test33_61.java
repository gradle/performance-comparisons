package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_61 {
    private final Production33_61 production = new Production33_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}