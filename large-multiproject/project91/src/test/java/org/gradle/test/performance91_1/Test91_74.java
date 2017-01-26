package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_74 {
    private final Production91_74 production = new Production91_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}