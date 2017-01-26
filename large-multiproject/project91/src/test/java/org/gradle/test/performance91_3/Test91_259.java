package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_259 {
    private final Production91_259 production = new Production91_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}