package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_181 {
    private final Production91_181 production = new Production91_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}