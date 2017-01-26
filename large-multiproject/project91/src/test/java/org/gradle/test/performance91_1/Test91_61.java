package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_61 {
    private final Production91_61 production = new Production91_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}