package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_8 {
    private final Production91_8 production = new Production91_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}