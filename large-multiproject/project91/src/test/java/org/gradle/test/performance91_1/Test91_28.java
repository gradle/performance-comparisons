package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_28 {
    private final Production91_28 production = new Production91_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}