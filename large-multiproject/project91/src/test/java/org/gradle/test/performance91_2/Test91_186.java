package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_186 {
    private final Production91_186 production = new Production91_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}