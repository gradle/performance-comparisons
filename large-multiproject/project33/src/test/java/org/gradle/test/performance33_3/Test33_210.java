package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_210 {
    private final Production33_210 production = new Production33_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}