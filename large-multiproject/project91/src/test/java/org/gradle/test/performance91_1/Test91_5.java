package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_5 {
    private final Production91_5 production = new Production91_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}