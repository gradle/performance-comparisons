package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_364 {
    private final Production91_364 production = new Production91_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}