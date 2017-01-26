package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_37 {
    private final Production91_37 production = new Production91_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}