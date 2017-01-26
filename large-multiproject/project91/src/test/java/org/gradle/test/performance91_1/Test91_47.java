package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_47 {
    private final Production91_47 production = new Production91_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}