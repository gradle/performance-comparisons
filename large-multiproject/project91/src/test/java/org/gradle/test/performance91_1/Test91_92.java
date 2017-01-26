package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_92 {
    private final Production91_92 production = new Production91_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}