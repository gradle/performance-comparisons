package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_196 {
    private final Production91_196 production = new Production91_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}