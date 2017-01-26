package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_307 {
    private final Production91_307 production = new Production91_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}