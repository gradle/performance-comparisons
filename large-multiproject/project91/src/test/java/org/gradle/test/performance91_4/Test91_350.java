package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_350 {
    private final Production91_350 production = new Production91_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}