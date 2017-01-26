package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_401 {
    private final Production33_401 production = new Production33_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}