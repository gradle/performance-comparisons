package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_231 {
    private final Production91_231 production = new Production91_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}