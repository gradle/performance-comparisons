package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_147 {
    private final Production91_147 production = new Production91_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}