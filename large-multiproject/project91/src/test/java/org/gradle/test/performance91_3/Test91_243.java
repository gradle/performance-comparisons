package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_243 {
    private final Production91_243 production = new Production91_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}