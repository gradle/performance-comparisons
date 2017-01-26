package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_154 {
    private final Production91_154 production = new Production91_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}