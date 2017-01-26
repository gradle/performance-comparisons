package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_204 {
    private final Production33_204 production = new Production33_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}