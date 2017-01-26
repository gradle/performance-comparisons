package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_53 {
    private final Production91_53 production = new Production91_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}