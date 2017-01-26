package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_146 {
    private final Production91_146 production = new Production91_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}