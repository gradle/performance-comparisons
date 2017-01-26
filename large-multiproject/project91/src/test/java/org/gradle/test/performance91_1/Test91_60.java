package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_60 {
    private final Production91_60 production = new Production91_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}