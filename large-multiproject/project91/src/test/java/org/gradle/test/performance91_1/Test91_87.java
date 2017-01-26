package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_87 {
    private final Production91_87 production = new Production91_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}