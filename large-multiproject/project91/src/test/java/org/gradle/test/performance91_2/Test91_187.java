package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_187 {
    private final Production91_187 production = new Production91_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}