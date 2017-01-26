package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_204 {
    private final Production91_204 production = new Production91_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}