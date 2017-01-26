package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_1 {
    private final Production91_1 production = new Production91_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}