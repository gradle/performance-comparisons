package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_6 {
    private final Production91_6 production = new Production91_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}