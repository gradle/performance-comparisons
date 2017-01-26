package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_161 {
    private final Production91_161 production = new Production91_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}