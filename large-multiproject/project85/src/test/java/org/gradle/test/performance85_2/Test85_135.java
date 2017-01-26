package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_135 {
    private final Production85_135 production = new Production85_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}