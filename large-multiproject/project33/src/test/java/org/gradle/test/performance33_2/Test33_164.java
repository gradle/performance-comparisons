package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_164 {
    private final Production33_164 production = new Production33_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}