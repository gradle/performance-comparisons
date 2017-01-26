package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_134 {
    private final Production91_134 production = new Production91_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}