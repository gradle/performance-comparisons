package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_260 {
    private final Production91_260 production = new Production91_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}