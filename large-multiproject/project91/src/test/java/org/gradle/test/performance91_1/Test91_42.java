package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_42 {
    private final Production91_42 production = new Production91_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}