package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_398 {
    private final Production91_398 production = new Production91_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}