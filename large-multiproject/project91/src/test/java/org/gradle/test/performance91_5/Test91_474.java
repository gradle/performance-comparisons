package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_474 {
    private final Production91_474 production = new Production91_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}