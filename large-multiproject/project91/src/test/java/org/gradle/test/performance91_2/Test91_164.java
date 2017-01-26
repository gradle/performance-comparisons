package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_164 {
    private final Production91_164 production = new Production91_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}