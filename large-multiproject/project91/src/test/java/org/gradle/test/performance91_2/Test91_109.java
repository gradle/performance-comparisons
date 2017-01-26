package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_109 {
    private final Production91_109 production = new Production91_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}