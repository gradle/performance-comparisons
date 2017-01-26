package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_106 {
    private final Production91_106 production = new Production91_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}