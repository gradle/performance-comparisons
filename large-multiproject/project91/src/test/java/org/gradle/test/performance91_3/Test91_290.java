package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_290 {
    private final Production91_290 production = new Production91_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}